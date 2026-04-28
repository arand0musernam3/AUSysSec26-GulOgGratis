package kd;

import ae.q;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import fd.t;
import fd.z;
import java.nio.ByteBuffer;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import td.o;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26277a;

    public /* synthetic */ a(int i11) {
        this.f26277a = i11;
    }

    @Override // kd.h
    public final i a(Object obj, o oVar, t tVar) {
        int i11 = 0;
        int i12 = 1;
        int i13 = 2;
        switch (this.f26277a) {
            case 0:
                z zVar = (z) obj;
                Bitmap.Config[] configArr = q.f1262a;
                if (Intrinsics.areEqual(zVar.f17606c, "file") && Intrinsics.areEqual(CollectionsKt.firstOrNull(fd.o.h(zVar)), "android_asset")) {
                    return new b(zVar, oVar, i11);
                }
                return null;
            case 1:
                return new c((Bitmap) obj);
            case 2:
                return new d((byte[]) obj, oVar, i11);
            case 3:
                return new d((ByteBuffer) obj, oVar, i12);
            case 4:
                z zVar2 = (z) obj;
                if (Intrinsics.areEqual(zVar2.f17606c, "content")) {
                    return new f(zVar2, oVar);
                }
                return null;
            case 5:
                z zVar3 = (z) obj;
                if (Intrinsics.areEqual(zVar3.f17606c, Bayeux.KEY_DATA)) {
                    return new b(zVar3, oVar, i12);
                }
                return null;
            case 6:
                return new d((Drawable) obj, oVar, i13);
            case 7:
                z zVar4 = (z) obj;
                String str = zVar4.f17606c;
                if ((str != null && !Intrinsics.areEqual(str, "file")) || zVar4.f17608e == null) {
                    return null;
                }
                Bitmap.Config[] configArr2 = q.f1262a;
                if (Intrinsics.areEqual(zVar4.f17606c, "file") && Intrinsics.areEqual(CollectionsKt.firstOrNull(fd.o.h(zVar4)), "android_asset")) {
                    return null;
                }
                return new b(zVar4, oVar, i13);
            case 8:
                z zVar5 = (z) obj;
                if (Intrinsics.areEqual(zVar5.f17606c, "jar:file")) {
                    return new b(zVar5, oVar, 3);
                }
                return null;
            default:
                z zVar6 = (z) obj;
                if (Intrinsics.areEqual(zVar6.f17606c, "android.resource")) {
                    return new b(zVar6, oVar, 4);
                }
                return null;
        }
    }
}
