create table customer(
	customer_name varchar(100) not null primary key,
	bank_requisites varchar(100) not null,
	c_phone_number varchar(18) not null,
	contact_person varchar(100)
);

create table broadcast(
	broadcast_name varchar(100) not null primary key,
	broadcast_priority integer not null,
	minute_cost numeric not null
);

create table advertising(
	advertising_id serial primary key,
	r_broadcast_name varchar(100) references broadcast(broadcast_name),
	r_customer_name varchar(100) references customer(customer_name),
	advertising_date date,
	advertising_duration integer
);

create table agent(
	agent_id serial primary key,
	agent_payment numeric not null
);

create table agent_adv_connection(
	agent_to_adv integer references advertising(advertising_id),
	avd_to_agent integer references agent(agent_id)
);