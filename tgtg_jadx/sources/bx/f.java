package bx;

import java.io.ObjectStreamException;
import java.io.Serializable;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6716d;

    public f(String str, boolean z11, String str2, boolean z12) {
        str.getClass();
        str2.getClass();
        this.f6713a = str;
        this.f6714b = str2;
        this.f6715c = z11;
        this.f6716d = z12;
    }

    private final Object readResolve() throws ObjectStreamException, JSONException {
        return new g(this.f6713a, this.f6715c, this.f6714b, this.f6716d);
    }
}
