package o40;

import com.google.firebase.encoders.EncodingException;
import java.util.Map;
import p40.g;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements m40.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31971a;

    @Override // m40.a
    public final void a(Object obj, Object obj2) {
        switch (this.f31971a) {
            case 0:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                m40.d dVar = (m40.d) obj2;
                dVar.a(g.f34432g, entry.getKey());
                dVar.a(g.f34433h, entry.getValue());
                return;
            default:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
