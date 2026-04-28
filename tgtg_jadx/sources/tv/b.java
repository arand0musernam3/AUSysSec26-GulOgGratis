package tv;

import com.braze.dispatch.f;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f40478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f40479c;

    public /* synthetic */ b(long j9, f fVar, int i11) {
        this.f40477a = i11;
        this.f40478b = j9;
        this.f40479c = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f40477a) {
            case 0:
                return f.a(this.f40478b, this.f40479c);
            default:
                return f.b(this.f40478b, this.f40479c);
        }
    }
}
