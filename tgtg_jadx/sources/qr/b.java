package qr;

import i90.h;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
public final class b extends d {

    @NotNull
    public static final b INSTANCE = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Object f37239b = l.a(m.PUBLICATION, new q60.a(21));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof b);
    }

    public final int hashCode() {
        return 1101247838;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, u70.j] */
    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) f37239b.getValue();
    }

    public final String toString() {
        return "AddressScreen";
    }
}
