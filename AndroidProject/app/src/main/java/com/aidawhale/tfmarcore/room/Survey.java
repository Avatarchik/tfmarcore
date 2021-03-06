package com.aidawhale.tfmarcore.room;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;

import com.google.gson.annotations.SerializedName;

@Entity(
    tableName = "survey",
    primaryKeys = {"date", "user"},
    foreignKeys = @ForeignKey(
        entity = User.class,
        parentColumns = "user_id",
        childColumns = "user",
        onDelete = ForeignKey.CASCADE
    ),
    indices = {
        @Index("user"),
        @Index("date")
    }
)
public class Survey {

    //PrimaryKey
    @NonNull
    @ColumnInfo(name = "date")
    @SerializedName("date")
    public String date;

    //PrimaryKey
    @NonNull
    @ColumnInfo(name = "user")
    @SerializedName("user_str")
    public String user;

    @NonNull
    @ColumnInfo(name = "happiness")
    @SerializedName("happiness")
    public int happiness;

    @NonNull
    @ColumnInfo(name = "food")
    @SerializedName("food")
    public int food;

    @NonNull
    @ColumnInfo(name = "pain")
    @SerializedName("pain")
    public int pain;

    // Constructor
    public Survey(String date, String user, int happiness, int food, int pain) {
        this.date = date;
        this.user = user;
        this.happiness = happiness;
        this.food = food;
        this.pain = pain;
    }

}
