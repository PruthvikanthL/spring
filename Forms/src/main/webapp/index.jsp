<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Help Hub - One Stop Public Help Portal</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" />
    <style>
        body {
          font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
          background-color: #f8f9fa;
        }

        .navbar-brand {
          font-weight: bold;
          font-size: 1.5rem;
        }

        .hero {
          background: linear-gradient(135deg, #007bff 0%, #00c6ff 100%);
          color: white;
          padding: 60px 20px;
          text-align: center;
        }

        .hero h1 {
          font-size: 3rem;
          font-weight: bold;
        }

        .hero h3 {
          font-weight: 300;
          font-size: 1.5rem;
        }

        .form-cards {
          padding: 40px 20px;
        }

        .card-title {
          font-size: 1.2rem;
          font-weight: 600;
        }

        .footer {
          text-align: center;
          padding: 20px;
          background-color: #e9ecef;
          margin-top: 40px;
        }
    </style>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light shadow-sm">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Help Hub</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavDropdown">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item"><a class="nav-link active" href="job.jsp">Job Application</a></li>
                <li class="nav-item"><a class="nav-link active" href="Government.jsp">Government Scheme</a></li>
                <li class="nav-item"><a class="nav-link active" href="Complaint.jsp">Complaint Form</a></li>
                <li class="nav-item"><a class="nav-link active" href="Medical.jsp">Medical Help</a></li>
                <li class="nav-item"><a class="nav-link active" href="Tution.jsp">Tuition Request</a></li>
                <li class="nav-item"><a class="nav-link active" href="Scholarship.jsp">Scholarship Form</a></li>
            </ul>
            <form class="d-flex">
                <input class="form-control me-2" type="search" placeholder="Search Help..." />
                <button class="btn btn-outline-primary" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>

<div class="hero">
    <h1>Welcome to Help Hub</h1>
    <h3>One Stop Public Help Portal</h3>
    <p>Access all essential forms and services in one platform</p>
</div>


<div class="container form-cards">
    <div class="row g-4">
        <div class="col-md-4">
            <div class="card h-100 shadow-sm">
                <div class="card-body">
                    <h5 class="card-title">Job Application</h5>
                    <p class="card-text">Apply for jobs with ease using our smart form.</p>
                    <a href="job.jsp" class="btn btn-primary">Open Form</a>
                </div>
            </div>
        </div>
        <div class="col-md-4">
            <div class="card h-100 shadow-sm">
                <div class="card-body">
                    <h5 class="card-title">Government Scheme</h5>
                    <p class="card-text">Get benefits from various government schemes.</p>
                    <a href="Government.jsp" class="btn btn-primary">Apply Now</a>
                </div>
            </div>
        </div>
        <div class="col-md-4">
            <div class="card h-100 shadow-sm">
                <div class="card-body">
                    <h5 class="card-title">Complaint Form</h5>
                    <p class="card-text">Report issues directly to concerned departments.</p>
                    <a href="Complaint.jsp" class="btn btn-primary">Submit Complaint</a>
                </div>
            </div>
        </div>
        <div class="col-md-4">
            <div class="card h-100 shadow-sm">
                <div class="card-body">
                    <h5 class="card-title">Medical Help</h5>
                    <p class="card-text">Request emergency or routine medical support.</p>
                    <a href="Medical.jsp" class="btn btn-primary">Request Help</a>
                </div>
            </div>
        </div>
        <div class="col-md-4">
            <div class="card h-100 shadow-sm">
                <div class="card-body">
                    <h5 class="card-title">Online Tuition</h5>
                    <p class="card-text">Need academic support? Request tuition help here.</p>
                    <a href="Tution.jsp" class="btn btn-primary">Get Tuition</a>
                </div>
            </div>
        </div>
        <div class="col-md-4">
            <div class="card h-100 shadow-sm">
                <div class="card-body">
                    <h5 class="card-title">Scholarship Form</h5>
                    <p class="card-text">Apply for educational scholarships easily.</p>
                    <a href="Scholarship.jsp" class="btn btn-primary">Apply Scholarship</a>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="footer">
    &copy; 2025 Help Hub | All rights reserved.
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
