package k90;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.n0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import qc.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f26203b = n0.f26529a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f26204c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f26205d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f26206e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f26207f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f26208g = new ArrayList();

    public a(String str) {
        this.f26202a = str;
    }

    public static void a(a aVar, String str, SerialDescriptor serialDescriptor) {
        n0 n0Var = n0.f26529a;
        aVar.getClass();
        str.getClass();
        serialDescriptor.getClass();
        n0Var.getClass();
        if (!aVar.f26205d.add(str)) {
            y.k(e0.f.s("Element with name '", str, "' is already registered in "), aVar.f26202a);
            return;
        }
        aVar.f26204c.add(str);
        aVar.f26206e.add(serialDescriptor);
        aVar.f26207f.add(n0Var);
        aVar.f26208g.add(false);
    }
}
