package com.capgemini.edmund.search;

import com.car.api.search.SearchObject;
import com.car.api.style.Style;
import com.car.api.style.StyleApiResponse;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("searchcars")
public class SearchCars {
    public SearchCars() {
    }

    @POST
    @Path("/search")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public StyleApiResponse search(SearchObject searchObject) {
        System.out.println(searchObject.getMake());
        SearchHelper searchHelper = new SearchHelper();
        List<Style> filteredList = searchHelper.filter(searchObject);
        StyleApiResponse styleApiResponse = new StyleApiResponse();
        styleApiResponse.setStyles(filteredList.toArray(new Style[filteredList.size()]));
        styleApiResponse.setStylesCount(filteredList.size());
        return styleApiResponse;
    }
    
    @GET
    @Path("/dudeWhereIsMyCar")
    @Produces(MediaType.TEXT_PLAIN)
    public String dudeWhereIsMyCar() {

        return "fuck u";
    }
}
