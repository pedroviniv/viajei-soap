CREATE TABLE transport (
	id SERIAL,
	description TEXT,
	type TEXT,
	seats INTEGER,
	PRIMARY KEY(id)
);


CREATE TABLE route(
	id SERIAL,
	transport_id BIGINT,
	type TEXT,
	distance BIGINT,
	estimated_duration BIGINT,
	destiny_cep VARCHAR(255),
	destiny_city VARCHAR(255),
	destiny_country VARCHAR(255),
	destiny_state VARCHAR(255),
	origin_cep VARCHAR(255),
	origin_city VARCHAR(255),
	origin_country VARCHAR(255),
	origin_state VARCHAR(255),
	estimated_arrive TIMESTAMP,
	estimated_departure TIMESTAMP,
	FOREIGN KEY(transport_id) REFERENCES transport(id),
	PRIMARY KEY(id)
);

