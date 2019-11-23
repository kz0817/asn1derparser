SUBJ := '/C=JP/ST=Tokyo/L=Minato-ku/O=Example Org./OU=Example Unit/CN=www.example.com'

server.der: server.csr server.key
	openssl x509 -in $< -days 365 -req -signkey server.key -outform der -out $@

server.csr: server.key
	openssl req -new -key $< -subj $(SUBJ) -out $@

server.key:
	openssl genrsa 2024 > $@
