package uf;

import java.io.File;
import java.io.FilenameFilter;
import kotlin.text.StringsKt;
import kotlin.text.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f41077b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f41076a = i11;
        this.f41077b = obj;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f41076a) {
            case 0:
                g gVar = (g) this.f41077b;
                gVar.getClass();
                str.getClass();
                return (!StringsKt.z(str, gVar.f41099b, false) || y.j(str, ".tmp", false) || y.j(str, ".properties", false)) ? false : true;
            case 1:
                g gVar2 = (g) this.f41077b;
                str.getClass();
                return StringsKt.z(str, gVar2.f41099b, false) && y.j(str, ".tmp", false);
            case 2:
                g gVar3 = (g) this.f41077b;
                str.getClass();
                return StringsKt.z(str, gVar3.f41099b, false) && !y.j(str, ".properties", false);
            default:
                return str.startsWith((String) this.f41077b);
        }
    }
}
