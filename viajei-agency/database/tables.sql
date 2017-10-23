CREATE TABLE packet (
	id SERIAL,
	hotel_id BIGINT,
	room_id BIGINT,
	transport_id BIGINT,
	route_id BIGINT,
	cost NUMERIC,
	PRIMARY KEY(id)
);

CREATE TABLE packet_order (
	
	id SERIAL,
	packet_id BIGINT,
	hotel_booking_id BIGINT,
	transport_ticket_id BIGINT,
	client_cpf TEXT,
	FOREIGN KEY(packet_id) REFERENCES packet(id),
	PRIMARY KEY(id) 
);