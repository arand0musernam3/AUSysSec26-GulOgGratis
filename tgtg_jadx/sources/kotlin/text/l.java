package kotlin.text;

import java.util.List;
import java.util.regex.Matcher;
import kotlin.collections.d1;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements MatchResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matcher f26614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f26615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kotlin.collections.j f26616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d1 f26617d;

    public l(Matcher matcher, CharSequence charSequence) {
        matcher.getClass();
        charSequence.getClass();
        this.f26614a = matcher;
        this.f26615b = charSequence;
        this.f26616c = new kotlin.collections.j(this, 1);
    }

    @Override // kotlin.text.MatchResult
    public final List a() {
        if (this.f26617d == null) {
            this.f26617d = new d1(this);
        }
        d1 d1Var = this.f26617d;
        d1Var.getClass();
        return d1Var;
    }

    @Override // kotlin.text.MatchResult
    public final IntRange b() {
        Matcher matcher = this.f26614a;
        return n80.p.j(matcher.start(), matcher.end());
    }

    @Override // kotlin.text.MatchResult
    public final String getValue() {
        String strGroup = this.f26614a.group();
        strGroup.getClass();
        return strGroup;
    }

    @Override // kotlin.text.MatchResult
    public final l next() {
        Matcher matcher = this.f26614a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.f26615b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        if (matcher2.find(iEnd)) {
            return new l(matcher2, charSequence);
        }
        return null;
    }
}
