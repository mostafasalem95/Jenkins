insert into customer(id, name, address) values(1, 'Kalles Grustransporter AB', 'Cementvägen 8, 111 11 Södertälje');
insert into customer(id, name, address) values(2, 'Johans Bulk AB', 'Balkvägen 12, 222 22 Stockholm');
insert into customer(id, name, address) values(3, 'Haralds Värdetransporter AB', 'Budgetvägen 1, 333 33 Uppsala');


insert into vehicle(id, reg_nr, status, customer_id) values('YS2R4X20005399401', 'ABC123', 'Test',  1);
insert into vehicle(id, reg_nr, status, customer_id) values('VLUR4X20009093588', 'DEF456', 'Test', 1);
insert into vehicle(id, reg_nr, status, customer_id) values('VLUR4X20009048066', 'GHI789', 'Test', 1);

insert into vehicle(id, reg_nr, status, customer_id) values('YS2R4X20005388011', 'JKL012', 'Test', 2);
insert into vehicle(id, reg_nr, status, customer_id) values('YS2R4X20005387949', 'MNO345', 'Test', 2);

insert into vehicle(id, reg_nr, status, customer_id) values('VLUR4X20009047066', 'PQR678', 'Test', 3);
insert into vehicle(id, reg_nr, status, customer_id) values('YS2R4X20005387055', 'STU901', 'Test', 3);