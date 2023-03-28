# JMP security

Use `docker-compose.yaml` to run posgtgres


Schema and data for sql tables are located inside resources: `schema.sql` and `data.sql`. They are executed by Spring on app start.

## Users

- user: `user@mail.com` - pass `admin`
- admin: `admin@mail.com` - pass `admin`
- guest: `guest@mail.com` - pass `guest`

## URLs

- `/about` - anybody can access
- `/info` - user and admin are able to access
- `/admin` - only admin can access
- POST `/register` - only admin can access

Register payload example:
```json
{
    "email": "abc",
    "password": "abc"
}
```

## Salt and encryption

Passwords are salted using BCrypt