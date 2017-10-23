CREATE TABLE hotel (
	id SERIAL,
	name TEXT,
	country TEXT,
	uf TEXT,
	city TEXT,
	neighborhood TEXT,
	street TEXT,
	number INTEGER,
	PRIMARY KEY(id)
);

CREATE TABLE room (
	id SERIAL,
	description TEXT,
	occupied BOOLEAN,
	hotel_id BIGINT,
	daily NUMERIC,
	FOREIGN KEY(hotel_id) REFERENCES hotel(id),
	PRIMARY KEY(id)
);

CREATE TABLE booking (
	id SERIAL,
	client_cpf TEXT,
	hotel_id BIGINT,
	room_id BIGINT,
	start_at TIMESTAMP,
	finish_at TIMESTAMP,
	days INTEGER,
	FOREIGN KEY(hotel_id) REFERENCES hotel(id),
	FOREIGN KEY(room_id) REFERENCES room(id),
	PRIMARY KEY(id)
);
