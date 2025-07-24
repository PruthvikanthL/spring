<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Medical Help Request | Help Hub</title>
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
    <h2 class="form-title">Medical Help Request Form</h2>
    <form action="medicalhelp">
        <div class="mb-3">
            <label for="patientName" class="form-label">Patient Name</label>
            <input type="text" class="form-control" id="patientName" name="patientName" placeholder="Enter patient full name" required>
        </div>
        <div class="mb-3">
            <label for="age" class="form-label">Age</label>
            <input type="number" class="form-control" id="age" name="age" placeholder="Enter patient age" required>
        </div>
        <div class="mb-3">
            <label for="condition" class="form-label">Medical Condition</label>
            <input type="text" class="form-control" id="condition" name="condition" placeholder="Describe the patient's condition" required>
        </div>
        <div class="mb-3">
            <label for="location" class="form-label">Current Location</label>
            <input type="text" class="form-control" id="location" name="location" placeholder="Enter location/address" required>
        </div>
        <div class="mb-3">
            <label for="emergencyType" class="form-label">Type of Emergency</label>
            <select class="form-select" id="emergencyType" name="emergencyType" required>
                <option value="">-- Select Emergency Type --</option>
                <option value="Accident">Accident</option>
                <option value="Heart Attack">Heart Attack</option>
                <option value="Stroke">Stroke</option>
                <option value="Burn">Burn</option>
                <option value="Other">Other</option>
            </select>
        </div>
        <div class="mb-3">
            <label for="hospital" class="form-label">Preferred Hospital</label>
            <input type="text" class="form-control" id="hospital" name="hospital" placeholder="Enter hospital name (optional)">
        </div>
        <button type="submit" class="btn btn-danger w-100">Request Medical Help</button>
    </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
