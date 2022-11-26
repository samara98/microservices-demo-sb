#!make

ifneq (,$(wildcard ./.env))
    include .env
    export
endif

dev:
	@set ENCRYPT_KEY=${ENCRYPT_KEY}
	@echo ENCRYPT_KEY=${ENCRYPT_KEY}
	docker-compose -f .\docker-compose\common.yml -f .\docker-compose\kafka_cluster.yml -f .\docker-compose\services.yml up --remove-orphans
