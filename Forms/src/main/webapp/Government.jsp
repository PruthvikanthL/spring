<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Government Scheme Request | Help Hub</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
          background-color: #f8f9fa;
        }
        .form-section {
          max-width: 700px;
          margin: auto;
          padding: 40px;
          background: white;
          border-radius: 15px;
          box-shadow: 0 8px 20px rgba(0,0,0,0.1);
        }
        .form-heading {
          text-align: center;
          margin-bottom: 30px;
        }
        .form-heading h1 {
          color: #0d6efd;
          font-weight: bold;
        }
        .form-heading h3 {
          color: #198754;
        }
        .form-heading h2 {
          font-size: 1.2rem;
          font-weight: 500;
          color: #6c757d;
        }
    </style>
</head>
<body>
<nav class="navbar navbar-expand-lg bg-body-tertiary shadow-sm">
    <div class="container-fluid">
        <a class="navbar-brand fw-bold text-primary" href="index.jsp">Help Hub</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo02">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarTogglerDemo02">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" href="index.jsp">Home</a>
                </li>
            </ul>
            <form class="d-flex" role="search">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search"/>
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>

<div class="form-section mt-5">
    <div class="form-heading">
        <h1>Government Scheme Request</h1>
        <h3>The Government is with you to Serve</h3>
        <h2>Serving the people is equal to serving God</h2>
    </div>
    <form action="register">
        <div class="mb-3">
            <label for="firstname" class="form-label">First Name</label>
            <input type="text" class="form-control" id="firstname" name="firstname" placeholder="Enter your First Name" required>
        </div>
        <div class="mb-3">
            <label for="lastname" class="form-label">Last Name</label>
            <input type="text" class="form-control" id="lastname" name="lastname" placeholder="Enter your Last Name" required>
        </div>
        <div class="mb-3">
            <label for="aadhar" class="form-label">Aadhar Number</label>
            <input type="text" class="form-control" id="aadhar" name="aadhar" placeholder="Enter your Aadhar Number" maxlength="12" required>
        </div>
        <div class="mb-3">
            <label for="address" class="form-label">Address</label>
            <textarea class="form-control" id="address" name="address" placeholder="Enter your Address" rows="2" required></textarea>
        </div>
        <div class="mb-3">
            <label for="scheme" class="form-label">Scheme Name</label>
            <input type="text" class="form-control" id="scheme" name="scheme" placeholder="Type of Scheme Applying" required>
        </div>
        <div class="mb-3">
            <label for="reason" class="form-label">Reason for Applying</label>
            <input type="text" class="form-control" id="reason" name="reason" placeholder="Example: I need a home loan" required>
        </div>
        <div class="d-grid">
            <button type="submit" class="btn btn-primary btn-lg">Submit Request</button>
        </div>
    </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
