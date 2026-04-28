package qw;

import com.braze.configuration.RuntimeAppConfigurationProvider;
import com.braze.managers.j;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f37281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f37282c;

    public /* synthetic */ d(String str, String str2, int i11) {
        this.f37280a = i11;
        this.f37281b = str;
        this.f37282c = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f37280a) {
            case 0:
                return com.braze.triggers.managers.b.c(this.f37281b, this.f37282c);
            case 1:
                return com.braze.triggers.managers.b.b(this.f37281b, this.f37282c);
            case 2:
                return com.braze.triggers.managers.b.a(this.f37281b, this.f37282c);
            case 3:
                return RuntimeAppConfigurationProvider.writeString$lambda$52(this.f37281b, this.f37282c);
            case 4:
                return com.braze.images.a.b(this.f37281b, this.f37282c);
            case 5:
                return com.braze.images.a.c(this.f37281b, this.f37282c);
            case 6:
                return com.braze.images.a.a(this.f37281b, this.f37282c);
            case 7:
                return com.braze.images.a.d(this.f37281b, this.f37282c);
            default:
                return j.b(this.f37281b, this.f37282c);
        }
    }
}
