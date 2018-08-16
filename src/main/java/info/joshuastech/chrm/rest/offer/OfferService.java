package info.joshuastech.chrm.rest.offer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OfferService {

	@Autowired
	private OfferRepository offerRepository;
	
	public List<Offer> getAllOffers() {	
		List<Offer> offers = new ArrayList<Offer>();
		
		offerRepository.findAll()
		.forEach(offers::add);
		
		return offers;
	}
	
	public Offer getOffer(Long id) {
		return offerRepository.findById(id).get();
	}
	
	public void addOffer(Offer offer) {
		offerRepository.save(offer);
	}
	
	public void deleteOffer(Long id) {
		offerRepository.deleteById(id);
	}
	
	
}
