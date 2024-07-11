package com.openclassrooms.tourguide;

import gpsUtil.location.Location;

public record ClosestAttraction(
        String attractionName,
        Location attractionLocation,
        Location touristLocation,
        Double attractionDistance,
        Integer rewardPoints) {}
