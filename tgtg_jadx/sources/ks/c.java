package ks;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f26659b;

    public /* synthetic */ c(int i11, ArrayList arrayList) {
        this.f26658a = i11;
        this.f26659b = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f26658a) {
            case 0:
                this.f26659b.get(((Number) obj).intValue());
                break;
            case 1:
                this.f26659b.get(((Number) obj).intValue());
                break;
            case 2:
                this.f26659b.get(((Number) obj).intValue());
                break;
            default:
                this.f26659b.get(((Number) obj).intValue());
                break;
        }
        return null;
    }
}
