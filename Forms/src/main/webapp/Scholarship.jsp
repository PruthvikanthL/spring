<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Scholarship Application | Help Hub</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
          background-color: #f8f9fa;
        }
        .navbar-custom {
          background-color: #0d1b2a;
        }
        .navbar-brand, .nav-link, .navbar-text {
          color: #ffffff !important;
          font-weight: 500;
        }
        .navbar-brand {
          font-size: 1.5rem;
          font-weight: bold;
          color: #00bfff !important;
        }
        .form-container {
          max-width: 600px;
          margin: 60px auto;
          background: white;
          padding: 40px;
          border-radius: 15px;
          box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        .form-title {
          text-align: center;
          margin-bottom: 30px;
          font-weight: bold;
          color: #0d1b2a;
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
    <h2 class="form-title">Scholarship Application Form</h2>
    <form action="scholarshipapply">
        <div class="mb-3">
            <label for="studentName" class="form-label">Name</label>
            <input type="text" class="form-control" id="studentName" name="studentName" placeholder="Enter your full name" required>
        </div>
        <div class="mb-3">
            <label for="school" class="form-label">School / College</label>
            <input type="text" class="form-control" id="school" name="school" placeholder="Enter school or college name" required>
        </div>
        <div class="mb-3">
            <label for="income" class="form-label">Parent’s Income</label>
            <input type="text" class="form-control" id="income" name="income" placeholder="e.g., ₹60,000 per annum" required>
        </div>
        <div class="mb-3">
            <label for="marks" class="form-label">Previous Marks (%)</label>
            <input type="number" class="form-control" id="marks" name="marks" placeholder="e.g., 85" min="0" max="100" required>
        </div>
        <div class="mb-3">
            <label for="scholarshipType" class="form-label">Scholarship Type</label>
            <select class="form-select" id="scholarshipType" name="scholarshipType" required>
                <option selected disabled>Select Type</option>
                <option value="merit">Merit-Based</option>
                <option value="need">Need-Based</option>
                <option value="sports">Sports-Based</option>
                <option value="other">Other</option>
            </select>
        </div>
        <button type="submit" class="btn btn-primary w-100">Apply for Scholarship</button>
    </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
