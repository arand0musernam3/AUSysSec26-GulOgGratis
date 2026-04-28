package q4;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import kotlin.jvm.internal.Intrinsics;
import ky.o;
import org.xmlpull.v1.XmlPullParser;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParser f35983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35984b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f35985c;

    public a(XmlResourceParser xmlResourceParser) {
        this.f35983a = xmlResourceParser;
        o oVar = new o(12, false);
        oVar.f26718b = new float[64];
        this.f35985c = oVar;
    }

    public final float a(TypedArray typedArray, String str, int i11, float f11) {
        if (w6.a.e(this.f35983a, str)) {
            f11 = typedArray.getFloat(i11, f11);
        }
        b(typedArray.getChangingConfigurations());
        return f11;
    }

    public final void b(int i11) {
        this.f35984b = i11 | this.f35984b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f35983a, aVar.f35983a) && this.f35984b == aVar.f35984b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f35984b) + (this.f35983a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb2.append(this.f35983a);
        sb2.append(", config=");
        return k.o(sb2, this.f35984b, ')');
    }
}
