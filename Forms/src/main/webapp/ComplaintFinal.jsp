<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>

<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Complaint Submitted | Help Hub</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
          background-color: #f8f9fa;
          font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }

        .navbar-custom {
          background-color: #0d1b2a;
        }

        .navbar-brand {
          font-size: 1.7rem;
          font-weight: bold;
          color: #00bfff !important;
        }

        .nav-link,
        .navbar-text {
          color: #ffffff !important;
          font-weight: 500;
        }

        .form-container {
          max-width: 700px;
          margin: 80px auto;
          background: #ffffff;
          padding: 50px 40px;
          border-radius: 15px;
          box-shadow: 0 8px 24px rgba(0, 0, 0, 0.1);
        }

        .form-title {
          text-align: center;
          font-weight: 600;
          margin-bottom: 30px;
          color: #0d1b2a;
        }

        .info-heading {
          font-weight: 500;
          color: #343a40;
          margin-bottom: 15px;
        }

        .info-value {
          font-weight: bold;
          color: #212529;
          margin-bottom: 10px;
        }

        .footer-text {
          text-align: center;
          color: #6c757d;
          margin-top: 40px;
          font-size: 0.95rem;
        }
    </style>
</head>
<body>


<nav class="navbar navbar-expand-lg navbar-custom shadow-sm">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">Help Hub</a>
        <button class="navbar-toggler bg-light" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon text-light"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" href="index.jsp">Home</a>
                </li>
            </ul>
            <form class="d-flex" role="search">
                <input class="form-control me-2" type="search" placeholder="Search Help..." aria-label="Search">
                <button class="btn btn-outline-info" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>


<div class="form-container">
    <h2 class="form-title">Complaint Submitted Successfully</h2>
    <p class="text-center text-muted mb-4">Thank you for submitting your complaint. Here are the details:</p>

    <div class="info-heading">Name: <span class="info-value">${name}</span></div>
    <div class="info-heading">Contact Number: <span class="info-value">${contact}</span></div>
    <div class="info-heading">Email Address: <span class="info-value">${email}</span></div>
    <div class="info-heading">Complaint Title: <span class="info-value">${complaint}</span></div>
    <div class="info-heading">Location: <span class="info-value">${location}</span></div>
    <div class="info-heading">Issue Description: <span class="info-value">${issue}</span></div>

    <div class="footer-text mt-5">We will do our best to resolve your issue as quickly and efficiently as possible.</div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
