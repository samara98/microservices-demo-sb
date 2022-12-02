#!make

ifneq (,$(wildcard ./.env))
    include .env
    export
endif

dev:
	@set ENCRYPT_KEY=${ENCRYPT_KEY}
	@echo ENCRYPT_KEY=${ENCRYPT_KEY}
	@cd ./docker-compose && docker-compose up --remove-orphans -d

dev-attach:
	@set ENCRYPT_KEY=${ENCRYPT_KEY}
	@echo ENCRYPT_KEY=${ENCRYPT_KEY}
	@cd ./docker-compose && docker-compose up --remove-orphans

dev-down:
	@set ENCRYPT_KEY=${ENCRYPT_KEY}
	@echo ENCRYPT_KEY=${ENCRYPT_KEY}
	@cd ./docker-compose && docker-compose down
