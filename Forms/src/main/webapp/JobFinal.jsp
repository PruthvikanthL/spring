<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Application Submitted | Help Hub</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
          background-color: #f8f9fa;
          font-family: 'Segoe UI', sans-serif;
        }
        .navbar-custom {
          background-color: #0d1b2a;
        }
        .navbar-brand, .nav-link {
          color: #ffffff !important;
          font-weight: 500;
        }
        .navbar-brand {
          font-size: 1.6rem;
          color: #00bfff !important;
        }
        .confirmation-container {
          max-width: 700px;
          margin: 80px auto;
          background: white;
          padding: 50px;
          border-radius: 15px;
          box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);
          text-align: center;
        }
        .confirmation-container h2 {
          color: #0d1b2a;
          margin-bottom: 20px;
        }
        .confirmation-container h3 {
          margin-top: 30px;
          color: #198754;
        }
        .confirmation-container h4 {
          font-weight: normal;
          color: #343a40;
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

<div class="confirmation-container">
    <h2>🎉 Your Scholarship Application Has Been Submitted!</h2>
    <p class="text-muted">Here are the details you provided:</p>

    <h4><strong>Name:</strong> ${firstname} ${lastname}</h4>
    <h4><strong>Education:</strong> ${education}</h4>
    <h4><strong>Skills:</strong> ${skills}</h4>
    <h4><strong>Experience:</strong> ${experience}</h4>
    <h4><strong>Preferred Job Role:</strong> ${job}</h4>

    <h3>✅ Thank you for applying. We will get back to you shortly.</h3>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
