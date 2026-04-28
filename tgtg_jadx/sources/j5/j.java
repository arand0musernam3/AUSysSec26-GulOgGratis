package j5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24632a;

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f24632a == ((j) obj).f24632a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24632a);
    }

    public final String toString() {
        int i11 = this.f24632a;
        return i11 == 0 ? "Button" : i11 == 1 ? "Checkbox" : i11 == 2 ? "Switch" : i11 == 3 ? "RadioButton" : i11 == 4 ? "Tab" : i11 == 5 ? "Image" : i11 == 6 ? "DropdownList" : i11 == 7 ? "Picker" : i11 == 8 ? "Carousel" : "Unknown";
    }
}
