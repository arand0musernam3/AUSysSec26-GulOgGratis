package e7;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f15809c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(this.f15807a, bVar.f15807a) && Objects.equals(this.f15808b, bVar.f15808b) && Objects.equals(this.f15809c, bVar.f15809c);
    }

    public final int hashCode() {
        return Objects.hash(this.f15807a, this.f15808b, this.f15809c);
    }
}
