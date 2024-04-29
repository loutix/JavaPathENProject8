package com.openclassrooms.tourguide;

import gpsUtil.location.Location;

public record closestAttraction(
        String attractionName,
        Location attractionLocation,
        Location touristLocation,
        Double attractionDistance,
        Integer rewardPoints) {}

//todo -     String : // Name of Tourist attraction,
//-      Long  // Tourist attractions lat/long,
//-      Long // The user's location lat/long,
//-      Long  // The distance in miles between the user's location and each of the attractions.
//-      Long // The reward points for visiting each Attraction.