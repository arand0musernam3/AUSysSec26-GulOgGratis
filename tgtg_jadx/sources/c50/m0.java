package c50;

import androidx.datastore.core.CorruptionException;
import java.io.FileInputStream;
import java.io.IOException;
import kotlin.Unit;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements d8.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f7605a;

    public m0(w0 w0Var) {
        w0Var.getClass();
        this.f7605a = w0Var;
    }

    @Override // d8.x0
    public final Object a() {
        return new l0(this.f7605a.a(null), null, null);
    }

    @Override // d8.x0
    public final Unit b(Object obj, d8.g1 g1Var) throws IOException {
        byte[] bytes = n90.c.f30748d.c(l0.Companion.serializer(), (l0) obj).getBytes(Charsets.UTF_8);
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
            return (l0) bVar.b(l0.Companion.serializer(), str);
        } catch (Exception e5) {
            throw new CorruptionException("Cannot parse session data", e5);
        }
    }
}
