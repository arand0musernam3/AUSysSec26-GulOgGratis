package ip;

import com.braze.Constants;
import hp.b0;
import hp.b1;
import hp.e0;
import hp.e1;
import hp.i0;
import hp.i1;
import hp.k;
import hp.l0;
import hp.l1;
import hp.n;
import hp.o1;
import hp.u0;
import hp.y0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q90.a0;
import ra0.i;
import ra0.l;
import ra0.o;
import ra0.q;
import ra0.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\u00020\u00052\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0016\u0010\nJ\u0010\u0010\u0017\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0017\u0010\nJ2\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\f\u001a\u00020\u00182\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0010H§@¢\u0006\u0004\b\u001c\u0010\u001dJ2\u0010 \u001a\u00020\u001f2\b\b\u0001\u0010\f\u001a\u00020\u001e2\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0010H§@¢\u0006\u0004\b \u0010!J(\u0010#\u001a\u00020\"2\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0010H§@¢\u0006\u0004\b#\u0010$J\u001a\u0010%\u001a\u00020\u00122\b\b\u0001\u0010\f\u001a\u00020\u001eH§@¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\b\u0001\u0010\f\u001a\u00020'H§@¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\b\u0001\u0010+\u001a\u00020\u0010H§@¢\u0006\u0004\b-\u0010\u0014¨\u0006.À\u0006\u0003"}, d2 = {"Lip/d;", "", "", "Lq90/a0;", "files", "Lhp/l0;", "b", "(Ljava/util/List;Lx70/c;)Ljava/lang/Object;", "Lhp/u0;", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "(Lx70/c;)Ljava/lang/Object;", "Lhp/y0;", "request", "Lhp/b1;", "g", "(Lhp/y0;Lx70/c;)Ljava/lang/Object;", "", "recipeId", "", "h", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lhp/e1;", "l", "i", "Lhp/i0;", "timezoneOffset", "timeFormat", "Lhp/n;", "k", "(Lhp/i0;Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lhp/b0;", "Lhp/e0;", "e", "(Lhp/b0;Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lhp/k;", "f", "(Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", Constants.BRAZE_PUSH_CONTENT_KEY, "(Lhp/b0;Lx70/c;)Ljava/lang/Object;", "Lhp/i1;", "Lhp/l1;", "c", "(Lhp/i1;Lx70/c;)Ljava/lang/Object;", "shareToken", "Lhp/o1;", "j", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface d {
    @o("api/recipe/v4/async/recipeGenerator/cancel")
    @Nullable
    Object a(@NotNull @ra0.a b0 b0Var, @NotNull x70.c<? super Unit> cVar);

    @o("api/recipe/v4/uploadPictures")
    @l
    @Nullable
    Object b(@NotNull @q List<a0> list, @NotNull x70.c<? super l0> cVar);

    @o("api/recipe/v4/shareRecipe")
    @Nullable
    Object c(@NotNull @ra0.a i1 i1Var, @NotNull x70.c<? super l1> cVar);

    @o("api/recipe/v4/tags")
    @Nullable
    Object d(@NotNull x70.c<? super List<u0>> cVar);

    @o("api/recipe/v4/async/recipeGenerator/polling")
    @Nullable
    Object e(@NotNull @ra0.a b0 b0Var, @Nullable @i("X-TimezoneOffset") String str, @Nullable @i("X-24HourFormat") String str2, @NotNull x70.c<? super e0> cVar);

    @o("api/recipe/v4/currentStatus")
    @Nullable
    Object f(@Nullable @i("X-TimezoneOffset") String str, @Nullable @i("X-24HourFormat") String str2, @NotNull x70.c<? super k> cVar);

    @o("api/recipe/v4/saveRecipe")
    @Nullable
    Object g(@NotNull @ra0.a y0 y0Var, @NotNull x70.c<? super b1> cVar);

    @o("api/recipe/v4/deleteRecipe/{recipeId}")
    @Nullable
    Object h(@s(encoded = true, value = "recipeId") @NotNull String str, @NotNull x70.c<? super Unit> cVar);

    @o("api/recipe/v4/listBriefRecipes")
    @Nullable
    Object i(@NotNull x70.c<? super e1> cVar);

    @o("api/recipe/v4/shared/{shareToken}")
    @Nullable
    Object j(@s(encoded = true, value = "shareToken") @NotNull String str, @NotNull x70.c<? super o1> cVar);

    @o("api/recipe/v4/async/recipeGenerator/start")
    @Nullable
    Object k(@NotNull @ra0.a i0 i0Var, @Nullable @i("X-TimezoneOffset") String str, @Nullable @i("X-24HourFormat") String str2, @NotNull x70.c<? super n> cVar);

    @o("api/recipe/v4/listFullRecipes")
    @Nullable
    Object l(@NotNull x70.c<? super e1> cVar);
}
