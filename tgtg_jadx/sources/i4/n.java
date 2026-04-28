package i4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    public static String a(int i11) {
        return i11 == 0 ? "Clear" : i11 == 1 ? "Src" : i11 == 2 ? "Dst" : i11 == 3 ? "SrcOver" : i11 == 4 ? "DstOver" : i11 == 5 ? "SrcIn" : i11 == 6 ? "DstIn" : i11 == 7 ? "SrcOut" : i11 == 8 ? "DstOut" : i11 == 9 ? "SrcAtop" : i11 == 10 ? "DstAtop" : i11 == 11 ? "Xor" : i11 == 12 ? "Plus" : i11 == 13 ? "Modulate" : i11 == 14 ? "Screen" : i11 == 15 ? "Overlay" : i11 == 16 ? "Darken" : i11 == 17 ? "Lighten" : i11 == 18 ? "ColorDodge" : i11 == 19 ? "ColorBurn" : i11 == 20 ? "HardLight" : i11 == 21 ? "Softlight" : i11 == 22 ? "Difference" : i11 == 23 ? "Exclusion" : i11 == 24 ? "Multiply" : i11 == 25 ? "Hue" : i11 == 26 ? "Saturation" : i11 == 27 ? "Color" : i11 == 28 ? "Luminosity" : "Unknown";
    }

    public final boolean equals(Object obj) {
        return obj instanceof n;
    }

    public final int hashCode() {
        return Integer.hashCode(3);
    }

    public final String toString() {
        return a(3);
    }
}
