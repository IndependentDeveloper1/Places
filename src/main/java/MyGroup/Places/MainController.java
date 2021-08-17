package MyGroup.Places;

import MyGroup.Places.models.PostCinemas;
import MyGroup.Places.models.PostGalleries;
import MyGroup.Places.models.PostParks;
import MyGroup.Places.models.PostRestaurants;
import MyGroup.Places.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    private PostMuseumsService postMuseumsService;
    private PostMonumentsService postMonumentsService;
    private PostTheatresService postTheatresService;
    private PostCafeService postCafeService;
    private PostLibrariesService postLibrariesService;
    private PostStadiumsService postStadiumsService;
    private PostCinemasService postCinemasService;
    private PostRestaurantsService postRestaurantsService;
    private PostGalleriesService postGalleriesService;
    private PostParksService postParksService;

    @Autowired(required = true)
    public MainController(PostMuseumsService postMuseumsService,
                          PostMonumentsService postMonumentsService,
                          PostTheatresService postTheatresService,
                          PostParksService postParksService,
                          PostCafeService postCafeService,
                          PostLibrariesService postLibrariesService,
                          PostStadiumsService postStadiumsService,
                          PostCinemasService postCinemasService,
                          PostRestaurantsService postRestaurantsService,
                          PostGalleriesService postGalleriesService) {
        this.postMuseumsService = postMuseumsService;
        this.postMonumentsService = postMonumentsService;
        this.postParksService = postParksService;
        this.postTheatresService = postTheatresService;
        this.postCafeService = postCafeService;
        this.postLibrariesService = postLibrariesService;
        this.postStadiumsService = postStadiumsService;
        this.postCinemasService = postCinemasService;
        this.postRestaurantsService = postRestaurantsService;
        this.postGalleriesService = postGalleriesService;
    }




    @GetMapping("/index")
    public String greeting(Model model) {
        return "index";
    }

    @GetMapping("/museums")
    public String showMuseums(Model model){
        model.addAttribute("posts", postMuseumsService.findAll());
        System.out.println(postMuseumsService.findAll());
        return "pages/museums";
    }
    @GetMapping("/monuments")
    public String showBuildings(Model model){
        model.addAttribute("posts", postMonumentsService.findAll());
        return "pages/monuments";
    }
    @GetMapping("/theatres")
    public String showTheatres(Model model){
        model.addAttribute("posts", postTheatresService.findAll());
        return "pages/theatres";
    }
    @GetMapping("/galleries")
    public String showGalleries(Model model){
        model.addAttribute("posts", postGalleriesService.findAll());
        return "pages/galleries";
    }
    @GetMapping("/parks")
    public String showParks(Model model){
        model.addAttribute("posts", postParksService.findAll());
        return "pages/parks";
    }
    @GetMapping("/cafe")
    public String showCafe(Model model){
        model.addAttribute("posts", postCafeService.findAll());
        return "pages/cafe";
    }
    @GetMapping("/restaurants")
    public String showRestaurants(Model model){
        model.addAttribute("posts", postRestaurantsService.findAll());
        return "pages/restaurants";
    }
    @GetMapping("/stadiums")
    public String showStadiums(Model model){
        model.addAttribute("posts", postStadiumsService.findAll());
        return "pages/stadiums";
    }
    @GetMapping("/libraries")
    public String showLibraries(Model model){
        model.addAttribute("posts", postLibrariesService.findAll());
        return "pages/libraries";
    }
    @GetMapping("/cinemas")
    public String showCinemas(Model model){
        model.addAttribute("posts", postCinemasService.findAll());
        return "pages/cinemas";
    }

}
