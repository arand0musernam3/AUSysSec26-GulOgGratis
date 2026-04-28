package f50;

import androidx.datastore.core.CorruptionException;
import d8.g1;
import d8.x0;
import java.io.FileInputStream;
import java.io.IOException;
import kotlin.Unit;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f17352a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f17353b = new h(null, null, null, null, null);

    @Override // d8.x0
    public final /* bridge */ /* synthetic */ Object a() {
        return f17353b;
    }

    @Override // d8.x0
    public final Unit b(Object obj, g1 g1Var) throws IOException {
        byte[] bytes = n90.c.f30748d.c(h.Companion.serializer(), (h) obj).getBytes(Charsets.UTF_8);
        bytes.getClass();
        g1Var.f14621a.write(bytes);
        return Unit.f26487a;
    }

    @Override // d8.x0
    public final Object c(FileInputStream fileInputStream) throws CorruptionException {
        try {
            n90.b bVar = n90.c.f30748d;
            String str = new String(pd.g.H(fileInputStream), Charsets.UTF_8);
            bVar.getClass();
            return (h) bVar.b(h.Companion.serializer(), str);
        } catch (Exception e5) {
            throw new CorruptionException("Cannot parse session configs", e5);
        }
    }
}
