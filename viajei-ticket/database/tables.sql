CREATE TABLE ticket (

	id SERIAL,
	client_cpf VARCHAR(255),
	transport_id BIGINT,
	route_id BIGINT,
	seat_number INTEGER,
	departure TIMESTAMP,
	estimated_arrival TIMESTAMP,
	from_address VARCHAR(255),
	to_address VARCHAR(255),
	price NUMERIC,
	PRIMARY KEY(id)
);

