#!make

ifneq (,$(wildcard ./.env))
    include .env
    export
endif

dev:
	@set ENCRYPT_KEY=${ENCRYPT_KEY}
	@echo ENCRYPT_KEY=${ENCRYPT_KEY}
	@cd ./docker-compose && docker-compose up --remove-orphans
