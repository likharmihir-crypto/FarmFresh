<!DOCTYPE html>
<%@page import="java.util.List"%>
<html lang="en">
<% String nm="";
   List lst=(List) session.getAttribute("user"); 
    if(lst==null || lst.isEmpty())
    {
     response.sendRedirect("login.jsp");
    }else{
     nm=(String)lst.get(1);
    }
    %>
    
<%@ include file="Header.jsp" %>
    <!-- Hero Start -->
    <div class="container-fluid bg-primary py-5 bg-hero mb-5">
        <div class="container py-5">
            <div class="row justify-content-start">
                <div class="col-lg-8 text-center text-lg-start">
                    <h1 class="display-1 text-white mb-md-4">Our Services</h1>
                    <a href="" class="btn btn-primary py-md-3 px-md-5 me-3">Home</a>
                    <a href="" class="btn btn-secondary py-md-3 px-md-5">Services</a>
                </div>
            </div>
        </div>
    </div>
    <!-- Hero End -->


    <!-- Services Start -->
    <div class="container-fluid py-5">
        <div class="container">
            <div class="row g-5">
                <div class="col-lg-4 col-md-6">
                    <div class="mb-3">
                        <h6 class="text-primary text-uppercase">Services</h6>
                        <h1 class="display-5">Organic Farm Services</h1>
                    </div>
                    <p class="mb-4">We offer a wide range of organic farming services including fresh produce supply, dairy products, farm consultation, and direct farm delivery. Our goal is to connect farmers and customers while promoting healthy and sustainable food habits.
                    </p>
                    <a href="" class="btn btn-primary py-md-3 px-md-5">Contact Us</a>
                </div>
                <div class="col-lg-4 col-md-6">
                    <div class="service-item bg-light text-center p-5">
                        <i class="fa fa-carrot display-1 text-primary mb-3"></i>
                        <h4>Fresh Vegetables</h4>
                        <p class="mb-0">Daily harvested seasonal vegetables grown without chemical fertilizers. We ensure freshness, hygiene, and rich nutritional value from farm to home.
                        </p>
                    </div>
                </div>
                <div class="col-lg-4 col-md-6">
                    <div class="service-item bg-light text-center p-5">
                        <i class="fa fa-apple-alt display-1 text-primary mb-3"></i>
                        <h4>Fresh Fruits</h4>
                        <p class="mb-0">Naturally ripened fruits cultivated using eco-friendly farming methods. No artificial ripening agents are used to maintain taste and quality.
                        </p>
                    </div>
                </div>
                <div class="col-lg-4 col-md-6">
                    <div class="service-item bg-light text-center p-5">
                        <i class="fa fa-dog display-1 text-primary mb-3"></i>
                        <h4>Healthy Cattle</h4>
                        <p class="mb-0">Our dairy animals are raised in clean and natural conditions and fed organic fodder. We provide pure milk and dairy products directly from the farm.
                        </p>
                    </div>
                </div>
                <div class="col-lg-4 col-md-6">
                    <div class="service-item bg-light text-center p-5">
                        <i class="fa fa-tractor display-1 text-primary mb-3"></i>
                        <h4>Modern Transport</h4>
                        <p class="mb-0">Temperature-safe transportation ensures quick and damage-free delivery of farm products to customers and local markets.
                        </p>
                    </div>
                </div>
                <div class="col-lg-4 col-md-6">
                    <div class="service-item bg-light text-center p-5">
                        <i class="fa fa-seedling display-1 text-primary mb-3"></i>
                        <h4>Farming Plans</h4>
                        <p class="mb-0">We provide guidance for organic farming setup, crop selection, irrigation methods, and fertilizer planning for new and existing farmers.
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Services End -->


    <!-- Testimonial Start -->
    <div class="container-fluid bg-testimonial py-5 mt-5" style="margin-bottom: 135px;">
        <div class="container py-5">
            <div class="row justify-content-center">
                <div class="col-lg-7">
                    <div class="owl-carousel testimonial-carousel p-5">
                        <div class="testimonial-item text-center text-white">
                            <img class="img-fluid mx-auto p-2 border border-5 border-secondary rounded-circle mb-4" src="img/testimonial-2.jpg" alt="">
                            <p class="fs-5">Dolores sed duo clita justo dolor et stet lorem kasd dolore lorem ipsum. At lorem lorem magna ut et, nonumy labore diam erat. Erat dolor rebum sit ipsum.</p>
                            <hr class="mx-auto w-25">
                            <h4 class="text-white mb-0">Client Name</h4>
                        </div>
                        <div class="testimonial-item text-center text-white">
                            <img class="img-fluid mx-auto p-2 border border-5 border-secondary rounded-circle mb-4" src="img/testimonial-2.jpg" alt="">
                            <p class="fs-5">Dolores sed duo clita justo dolor et stet lorem kasd dolore lorem ipsum. At lorem lorem magna ut et, nonumy labore diam erat. Erat dolor rebum sit ipsum.</p>
                            <hr class="mx-auto w-25">
                            <h4 class="text-white mb-0">Client Name</h4>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Testimonial End -->
    

<%@ include file="footer.jsp" %></body>

</html>