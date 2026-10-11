package org.example.geometry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeometryTest {
    private final Geometry geometry = new Geometry();

    Map2D[] map = {
            new Map2D(-1, -1),
            new Map2D( 1,  1),
            new Map2D(-1,  1),
            new Map2D( 1, -1),
            new Map2D(10, 10)
    };

    @Test
    void testGeometry() {
        assertEquals(4, geometry.maxPointsWithPerimeter(map, 8));
    }

}
