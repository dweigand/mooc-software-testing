import RomanNumeral
import pytest

class TestRomanNumeral():

    def test_init(self):
        with pytest.raises(AssertionError):
            RomanNumeral.RomanNumeral("S")
        
    def test_convert_arabic_XVI(self):
        r = RomanNumeral.RomanNumeral("XVI")
        assert r.convert_arabic() == 16
    
    def test_convert_arabic_X(self):
        r = RomanNumeral.RomanNumeral("X")
        assert r.convert_arabic() == 10

    def test_convert_arabic_IX(self):
        r = RomanNumeral.RomanNumeral("IX")
        assert r.convert_arabic() == 9

