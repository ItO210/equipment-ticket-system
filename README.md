# HealthSync: An Equipment Ticket Management System

HealthSync is a ticket management system developed for Hospital del Niño Morelense to streamline the reporting and resolution of issues with hospital equipment such as computers, printers, and scanners. Hospital staff can submit tickets through a web form, while technicians and administrators use a Kotlin-based Android app to manage them. Technicians can view, claim, update, and close tickets, providing comments and images as evidence. Administrators can access historical records, view ticket statistics, evaluate technician performance, and manage technician accounts—all within the same mobile interface.

This project was developed on **September 2024**.

## Disclaimer

This repository is a **modified reupload** of the original project developed for Hospital del Niño Morelense. It is intended for **archival purposes only**. (This version is stripped of any company branding, logos, and sensitive features to comply with NDA agreements.)

## Features

- **Web Ticket Form**: Staff report equipment issues via a web interface.
- **Technician App**: Android app for viewing, claiming, and managing tickets.
- **Ticket States**: Tracks status: Not Started, In Progress, Resolved, Not Resolved, Deleted.
- **Admin Controls**: Admins manage users, view history, and access performance stats.
- **Image Upload**: Required for unresolved and deleted tickets.

## Contents

- **HealthSyncApp/**: Android app built with Kotlin for technicians and admins.
- **HealthSyncFrontend/**: Web form for hospital staff to submit tickets built with React.
- **HealthSyncAPI/**: REST API built with Node.js + Express.
- **HealthSyncDB/**: MySQL .sql file containing the database schema.

## Preview
![1](https://github.com/user-attachments/assets/849f862c-f2c9-4ca4-93f9-1e7909e19d3b)
![2](https://github.com/user-attachments/assets/0cc3deda-453a-45cd-9c0a-65ed51c737d4)
![3](https://github.com/user-attachments/assets/479f6c0b-946b-4a57-9e2c-84d33e97b51b)
![4](https://github.com/user-attachments/assets/5ab50fea-ab8f-4610-bd83-f68130231c8f)

## Contributors  
This project was developed collaboratively by:  

- [Iker Landeros]()
- [Carolina Figueroa]()
- [Eduardo Darío]()
- [Carlos Ito]()
- [Desirée Espinosa]()
