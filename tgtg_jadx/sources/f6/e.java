package f6;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j6.f f17389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17390b;

    public e(int i11, j6.f fVar, int i12) {
        switch (i12) {
            case 1:
                this.f17389a = fVar;
                String str = "start";
                if (i11 != -2) {
                    if (i11 == -1) {
                        str = "end";
                    } else if (i11 == 0) {
                        str = "left";
                    } else if (i11 != 1) {
                        Log.e("CCL", "verticalAnchorIndexToAnchorName: Unknown vertical index");
                    } else {
                        str = "right";
                    }
                }
                this.f17390b = str;
                break;
            default:
                this.f17389a = fVar;
                String str2 = "top";
                if (i11 != 0) {
                    if (i11 != 1) {
                        Log.e("CCL", "horizontalAnchorIndexToAnchorName: Unknown horizontal index");
                    } else {
                        str2 = "bottom";
                    }
                }
                this.f17390b = str2;
                break;
        }
    }

    public static void a(e eVar, g gVar) {
        float f11 = 0;
        float f12 = 0;
        eVar.getClass();
        int i11 = gVar.f17394b;
        String str = "top";
        if (i11 != 0) {
            if (i11 != 1) {
                Log.e("CCL", "horizontalAnchorIndexToAnchorName: Unknown horizontal index");
            } else {
                str = "bottom";
            }
        }
        j6.a aVar = new j6.a(new char[0]);
        aVar.j(j6.g.j(gVar.f17393a.toString()));
        aVar.j(j6.g.j(str));
        aVar.j(new j6.e(f11));
        aVar.j(new j6.e(f12));
        eVar.f17389a.A(eVar.f17390b, aVar);
    }

    public static void b(e eVar, h hVar, float f11, int i11) {
        if ((i11 & 2) != 0) {
            f11 = 0;
        }
        float f12 = 0;
        eVar.getClass();
        int i12 = hVar.f17397b;
        String str = "start";
        if (i12 != -2) {
            if (i12 == -1) {
                str = "end";
            } else if (i12 != 1) {
                Log.e("CCL", "verticalAnchorIndexToAnchorName: Unknown vertical index");
            } else {
                str = "right";
            }
        }
        j6.a aVar = new j6.a(new char[0]);
        aVar.j(j6.g.j(hVar.f17396a.toString()));
        aVar.j(j6.g.j(str));
        aVar.j(new j6.e(f11));
        aVar.j(new j6.e(f12));
        eVar.f17389a.A(eVar.f17390b, aVar);
    }
}
