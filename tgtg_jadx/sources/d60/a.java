package d60;

import b4.t;
import com.tgtg.componentlibrary.component.avatar.model.AvatarSize;
import com.tgtg.componentlibrary.component.avatar.variant.PantryAvatarIconFilledKt;
import com.tgtg.componentlibrary.component.avatar.variant.PantryAvatarIconTransparentKt;
import com.tgtg.componentlibrary.component.avatar.variant.PantryAvatarIllustrationKt;
import com.tgtg.componentlibrary.component.avatar.variant.PantryAvatarImageKt;
import i80.n;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f14541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f14542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f14543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AvatarSize f14544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f14545f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f14546g;

    public /* synthetic */ a(n nVar, t tVar, String str, AvatarSize avatarSize, int i11, int i12, int i13) {
        this.f14540a = i13;
        this.f14541b = nVar;
        this.f14542c = tVar;
        this.f14543d = str;
        this.f14544e = avatarSize;
        this.f14545f = i11;
        this.f14546g = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14540a) {
            case 0:
                ((Integer) obj2).intValue();
                PantryAvatarIconFilledKt.PantryAvatarIconFilled(this.f14541b, this.f14542c, this.f14543d, this.f14544e, (m3.n) obj, i.F(this.f14545f | 1), this.f14546g);
                break;
            case 1:
                ((Integer) obj2).intValue();
                PantryAvatarIconTransparentKt.PantryAvatarIconTransparent(this.f14541b, this.f14542c, this.f14543d, this.f14544e, (m3.n) obj, i.F(this.f14545f | 1), this.f14546g);
                break;
            case 2:
                ((Integer) obj2).intValue();
                PantryAvatarIllustrationKt.PantryAvatarIllustration(this.f14541b, this.f14542c, this.f14543d, this.f14544e, (m3.n) obj, i.F(this.f14545f | 1), this.f14546g);
                break;
            default:
                ((Integer) obj2).intValue();
                PantryAvatarImageKt.PantryAvatarImage(this.f14541b, this.f14542c, this.f14543d, this.f14544e, (m3.n) obj, i.F(this.f14545f | 1), this.f14546g);
                break;
        }
        return Unit.f26487a;
    }
}
