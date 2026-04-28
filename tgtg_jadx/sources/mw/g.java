package mw;

import kotlin.jvm.functions.Function0;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JSONArray f30230b;

    public /* synthetic */ g(int i11, JSONArray jSONArray) {
        this.f30229a = i11;
        this.f30230b = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f30229a) {
            case 0:
                return com.braze.support.d.a(this.f30230b);
            default:
                return com.braze.triggers.utils.c.b(this.f30230b);
        }
    }
}
