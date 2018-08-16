package info.joshuastech.chrm.rest.offer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@RestController
@Api(value = "OffersControllerAPI", produces=MediaType.APPLICATION_JSON_VALUE )
public class OfferController {
	
	@Autowired
	private OfferService offerService;

	@RequestMapping(method=RequestMethod.GET, value="/offers")
	@ApiOperation("Gets all Offers")
	public List<Offer> getAllOffers() {
		return offerService.getAllOffers();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/offers/{id}")
	@ApiOperation("Gets Offer with specific id")
	@ApiResponses(value = {@ApiResponse(code=200, message="OK", response = Offer.class)})
	public Offer getOffer(@PathVariable Long id) {
		return offerService.getOffer(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/offers")
	public void addOffer(@RequestBody Offer offer) {
		offerService.addOffer(offer);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/offers/{id}")
	public void updateOffer(@RequestBody Offer offer, @PathVariable Long id) {
		offerService.addOffer(offer);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/offers/{id}")
	public void deleteOffer(@PathVariable Long id) {
		offerService.deleteOffer(id);
	}
}
