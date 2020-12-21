select * from agent_adv_connection;

insert into agent(agent_id, agent_payment) values (2, 66);

insert into agent(agent_payment) values
(100.99),
(79.50),
(100.99),
(79.50),
(100.99),
(79.50),
(90);

insert into agent_adv_connection(agent_to_adv, adv_to_agent) values (2,1);

select * from agent;

select * from advertising;

insert into advertising(r_broadcast_name, r_customer_name, advertising_date, advertising_duration)
values ('The Truman Show', 'test customer', '2020-10-20', 2),
('Hot news', 'some', '2020-12-18', 5),
('Hot news', 'some', '2010-10-10', 3);

select * from broadcast;

delete from broadcast where broadcast_name = 'Lazy Town';

select * from customer;

delete from customer where customer_name = 'Z-corp';
insert into broadcast(broadcast_name, broadcast_priority, minute_cost)
values ('The Truman Show', 30, 500.99),
('Hot news', 50, 750.99);

select * from customer;

insert into customer(customer_name, bank_requisites, c_phone_number, contact_person)
values ('test customer', 'XXXX-XXXX-XXXX-XXXX', '+7-XXX-XXX-XX-XX', 'test person'),
('some', 'some requisites', 'some phone number', 'some person');

drop table agent_adv_connection;

drop table agent;

drop table advertising;

drop table broadcast;

drop table customer;

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
	r_broadcast_name varchar(100) references broadcast(broadcast_name) on delete cascade,
	r_customer_name varchar(100) references customer(customer_name) on delete cascade,
	advertising_date date,
	advertising_duration integer
);

create table agent(
	agent_id serial primary key,
	agent_payment numeric not null
);

create table agent_adv_connection(
	agent_to_adv integer references agent(agent_id) on delete cascade,
	adv_to_agent integer references advertising(advertising_id) on delete cascade
);

