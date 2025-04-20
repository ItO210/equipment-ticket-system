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
![1](https://github.com/user-attachments/assets/579e5a29-18f5-474a-92be-4212a9faaa00)
![2](https://github.com/user-attachments/assets/c3710a3f-a9eb-4c49-8e1c-5c10af5e59ce)
![3](https://github.com/user-attachments/assets/a8c74960-362f-44e3-a26d-afe6e574d4a3)
![4](https://github.com/user-attachments/assets/96041e80-a619-46a7-8ff0-c241b6e9bd11)

## Contributors  
This project was developed collaboratively by:  

- [Iker Landeros]()
- [Carolina Figueroa]()
- [Eduardo Darío]()
- [Carlos Ito]()
- [Desirée Espinosa]()
