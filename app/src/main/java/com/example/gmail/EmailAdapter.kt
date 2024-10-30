package com.example.gmail

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmailAdapter(private val emails: List<Email>) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_email, parent, false)
        return EmailViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        val email = emails[position]
        holder.bind(email)
    }

    override fun getItemCount(): Int = emails.size

    class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val senderName: TextView = itemView.findViewById(R.id.senderName)
        private val emailTitle: TextView = itemView.findViewById(R.id.emailTitle)
        private val emailSnippet: TextView = itemView.findViewById(R.id.emailSnippet)
        private val time: TextView = itemView.findViewById(R.id.time)
        private val starIcon: ImageView = itemView.findViewById(R.id.starIcon)

        fun bind(email: Email) {
            senderName.text = email.sender
            emailTitle.text = email.subject
            emailSnippet.text = email.snippet
            time.text = email.time
            starIcon.setImageResource(if (email.isStarred) R.drawable.ic_star else R.drawable.ic_star_border)
        }
    }
}