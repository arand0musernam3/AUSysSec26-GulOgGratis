package com.app.tgtg.model.remote.user.requests;

import e0.f;
import i90.g;
import i90.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.d;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;
import ui.o;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB?\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ4\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u0018R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b-\u0010(\u001a\u0004\b,\u0010\u001b¨\u00060"}, d2 = {"Lcom/app/tgtg/model/remote/user/requests/SurveyResult;", "", "", "questionType", "questionId", "", "answers", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/requests/SurveyResult;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/app/tgtg/model/remote/user/requests/SurveyResult;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getQuestionType", "getQuestionType$annotations", "()V", "getQuestionId", "getQuestionId$annotations", "Ljava/util/List;", "getAnswers", "getAnswers$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class SurveyResult {

    @NotNull
    private final List<String> answers;

    @NotNull
    private final String questionId;

    @NotNull
    private final String questionType;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final j[] $childSerializers = {null, null, l.a(m.PUBLICATION, new o(29))};

    public /* synthetic */ SurveyResult(int i11, String str, String str2, List list, m1 m1Var) {
        if (7 != (i11 & 7)) {
            c1.j(i11, 7, SurveyResult$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.questionType = str;
        this.questionId = str2;
        this.answers = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(r1.f29848a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SurveyResult copy$default(SurveyResult surveyResult, String str, String str2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = surveyResult.questionType;
        }
        if ((i11 & 2) != 0) {
            str2 = surveyResult.questionId;
        }
        if ((i11 & 4) != 0) {
            list = surveyResult.answers;
        }
        return surveyResult.copy(str, str2, list);
    }

    public static final /* synthetic */ void write$Self$app(SurveyResult self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.q(serialDesc, 0, self.questionType);
        output.q(serialDesc, 1, self.questionId);
        output.i(serialDesc, 2, (KSerializer) jVarArr[2].getValue(), self.answers);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getQuestionType() {
        return this.questionType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getQuestionId() {
        return this.questionId;
    }

    @NotNull
    public final List<String> component3() {
        return this.answers;
    }

    @NotNull
    public final SurveyResult copy(@NotNull String questionType, @NotNull String questionId, @NotNull List<String> answers) {
        questionType.getClass();
        questionId.getClass();
        answers.getClass();
        return new SurveyResult(questionType, questionId, answers);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyResult)) {
            return false;
        }
        SurveyResult surveyResult = (SurveyResult) other;
        return Intrinsics.areEqual(this.questionType, surveyResult.questionType) && Intrinsics.areEqual(this.questionId, surveyResult.questionId) && Intrinsics.areEqual(this.answers, surveyResult.answers);
    }

    @NotNull
    public final List<String> getAnswers() {
        return this.answers;
    }

    @NotNull
    public final String getQuestionId() {
        return this.questionId;
    }

    @NotNull
    public final String getQuestionType() {
        return this.questionType;
    }

    public int hashCode() {
        return this.answers.hashCode() + l1.b(this.questionType.hashCode() * 31, 31, this.questionId);
    }

    @NotNull
    public String toString() {
        String str = this.questionType;
        String str2 = this.questionId;
        return f.p(f.t("SurveyResult(questionType=", str, ", questionId=", str2, ", answers="), this.answers, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/requests/SurveyResult$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/requests/SurveyResult;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return SurveyResult$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("answers")
    public static /* synthetic */ void getAnswers$annotations() {
    }

    @g("question_id")
    public static /* synthetic */ void getQuestionId$annotations() {
    }

    @g("question_type")
    public static /* synthetic */ void getQuestionType$annotations() {
    }

    public SurveyResult(@NotNull String str, @NotNull String str2, @NotNull List<String> list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.questionType = str;
        this.questionId = str2;
        this.answers = list;
    }
}
