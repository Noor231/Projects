$(document).ready(function(){

    // Header FadeIn Effect
    $('#header').hide();
    $('#header').fadeIn(1000);
  
    // Responsive Navbar Hide effect
    $('#responsive-navbar').hide();
  
    // Responsive Menu Activation
    $('#menu-button').click(function(){
      $('#responsive-navbar').slideToggle();
    });
  
    // Responsive Menu Hiding Effect
    $('#home-menu , #projects-menu , #blogs-menu , #other-menu').click(function(){
      $('#responsive-navbar').slideToggle();
    })
  
  
  
  
    // Welcome Section Title FadeIn Effect
    $('#welcome-section-title').hide();
    $('#welcome-section-title').fadeIn(1000);
  
    // Hiding Effect added to each "overlay" effect
    $(".overlay-project-one").hide();
    $(".overlay-project-two").hide();
    $(".overlay-project-three").hide();
    $(".overlay-project-four").hide();
   
  
    // Hover Effect for the first project (Photoshop actions)
    $("#project-one").hover(function(){
      $(".overlay-project-one").slideDown();
    }, function () {
      $(".overlay-project-one").slideUp();
    });
  
    // Hover Effect for the second project (nebula backgrounds)
    $("#project-two").hover(function(){
      $(".overlay-project-two").slideDown();
    }, function () {
      $(".overlay-project-two").slideUp();
    });
  
    // Hover Effect for the third project (plexus backgrounds)
    $("#project-three").hover(function(){
      $(".overlay-project-three").slideDown();
    }, function () {
      $(".overlay-project-three").slideUp();
    });
  
    // Hover Effect for the fourt project (2D Planets)
    $("#project-four").hover(function(){
      $(".overlay-project-four").slideDown();
    }, function () {
      $(".overlay-project-four").slideUp();
    });
  
 
   // Responsive menu
    $("#responsive-nav-bar").hide();
  
    $("#image-button-black").click(function(){
      $("#responsive-nav-bar").slideToggle();
    });
  
    $("#responsive-home-item , #responsive-features-item , #responsive-products-item , #responsive-media-item , #responsive-pricing-item").click(function(){
      $("#responsive-nav-bar").slideToggle(200);
    });
  
  
  })
  