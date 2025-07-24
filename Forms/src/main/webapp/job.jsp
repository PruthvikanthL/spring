<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Job Application - Help Hub</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
          background: linear-gradient(to right, #f8f9fa, #e2f0ff);
          font-family: 'Segoe UI', sans-serif;
        }
        .form-container {
          max-width: 600px;
          margin: 50px auto;
          padding: 30px;
          border-radius: 15px;
          background-color: white;
          box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);
        }
        h1, h3 {
          color: #0d6efd;
        }
    </style>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">Help Hub</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link active" href="index.jsp">Home</a>
                </li>
            </ul>
        </div>
    </div>
</nav>


<div class="form-container">
    <h1 class="text-center mb-3">Job Application</h1>
    <h3 class="text-center mb-4">Apply Today, Secure Your Future</h3>

    <form action="submit" >
        <div class="mb-3">
            <label for="firstname" class="form-label">First Name</label>
            <input type="text" class="form-control" id="firstname" name="firstname" placeholder="Enter your first name" required>
        </div>

        <div class="mb-3">
            <label for="lastname" class="form-label">Last Name</label>
            <input type="text" class="form-control" id="lastname" name="lastname" placeholder="Enter your last name" required>
        </div>

        <div class="mb-3">
            <label for="education" class="form-label">Education Qualification</label>
            <input type="text" class="form-control" id="education" name="education" placeholder="Your highest degree or qualification" required>
        </div>

        <div class="mb-3">
            <label for="skills" class="form-label">Skills</label>
            <input type="text" class="form-control" id="skills" name="skills" placeholder="List your core skills" required>
        </div>

        <div class="mb-3">
            <label for="experience" class="form-label">Experience</label>
            <input type="text" class="form-control" id="experience" name="experience" placeholder="e.g., 2 years in Java development" required>
        </div>

        <div class="mb-3">
            <label for="job" class="form-label">Job Role Applying For</label>
            <input type="text" class="form-control" id="job" name="job" placeholder="e.g., Full Stack Developer" required>
        </div>

        <div class="text-center">
            <button type="submit" class="btn btn-primary px-4">Submit Application</button>
        </div>
    </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
