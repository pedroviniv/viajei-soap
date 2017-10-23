mvn clean install -f ./viajei-client
mvn clean install -f ./viajei-hotel
mvn clean install -f ./viajei-transport
sudo docker-compose up -d clients-web
sudo docker-compose up -d hotels-web
sudo docker-compose up -d transports-web

mvn clean install -f ./viajei-ticket
sudo docker-compose up -d tickets-web

mvn clean install -f ./viajei-agency
sudo docker-compose up -d agency-web